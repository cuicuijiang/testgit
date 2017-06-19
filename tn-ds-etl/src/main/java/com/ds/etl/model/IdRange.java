package com.ds.etl.model;

import java.util.ArrayList;
import java.util.List;


public class IdRange {
	private long start;
	private long end;
	
	public IdRange(long start, long end) {
		this.start = start;
		this.end = end;
	}

	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "[" + start + "," + end + "]";
	}

	
	public List<IdRange> split(IdRange idRange, long interval) {
		if (idRange.getStart() > idRange.getEnd()) {
			return new ArrayList<IdRange>();
		}
		
		long start = idRange.getStart();
		long end = idRange.getEnd();
		long totalInterval = end-start;
		long size = totalInterval/interval;
		
		List<IdRange> idRanges = new ArrayList<IdRange>();
		for (int i = 0; i <= size; i++) {
			long startNew = start+interval*i;
			long endNew = start+interval*(i+1)-1;
			endNew = endNew>end-1 ? end : endNew;
			idRanges.add(new IdRange(startNew, endNew));
		}
		
		end = idRanges.get(idRanges.size()-1).getEnd();
		if (end < idRange.getEnd()) {
			idRanges.add(new IdRange(end+1, idRange.getEnd()));
		}
		
		return idRanges;
	}
}
