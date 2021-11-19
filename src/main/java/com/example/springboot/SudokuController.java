package com.example.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import com.example.springboot.Sudoku;

import au.id.bjf.dlx.DLXResult;
import au.id.bjf.dlx.DLXResultProcessor;
import au.id.bjf.sudoku.dlx.DLXSudokuSolver;
import au.id.bjf.sudoku.swing.SudokuPanel;

@RestController
public class SudokuController {
	@PostMapping(value = "/sudoku", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Sudoku> test(@RequestBody Sudoku sudoku) {
		
		final SudokuPanel puzzlePanel = new SudokuPanel(sudoku.getNewPuzzle());
		byte[] puzzle = puzzlePanel.getPuzzle();
		new DLXSudokuSolver().solve(puzzle, new DLXResultProcessor() {
			public boolean processResult(DLXResult result) {
				DLXSudokuSolver solver = new DLXSudokuSolver();
				puzzlePanel.setPuzzle(solver.decodeDLXResult(result));
				return false;
			}
		});
		sudoku.setSolvedPuzzle(puzzlePanel.toString());

		return ResponseEntity.ok().body(sudoku);
	}
}
