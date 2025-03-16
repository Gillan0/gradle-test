package org.hanjiecreator.logic;

import java.util.List;

import org.hanjiecreator.model.Grid;
import org.hanjiecreator.model.GridHeightException;
import org.hanjiecreator.model.GridWidthException;

public class LineArray extends AxisArray {

	public LineArray(List<Integer> content, List<Integer> description, int index) {
		super(content, description, index);
	}
	
	public void updateGrid(Grid solveGrid) throws GridHeightException, GridWidthException {
		solveGrid.setLine(index, content);
	}

}
