package com.repos.model.commons;

import java.util.ArrayList;
import java.util.List;

/**
 * IdRange
 * @author zhangqingli
 *
 */
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

	
	public List<IdRange> split(long interval) {
		if (this.getStart() > this.getEnd()) {
			return new ArrayList<IdRange>();
		}
		
		long start = this.getStart();
		long end = this.getEnd();
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
		if (end < this.getEnd()) {
			idRanges.add(new IdRange(end+1, this.getEnd()));
		}
		
		return idRanges;
	}
	
	public static void main(String[] args) {
		IdRange idRange = new IdRange(5, 30);
		List<IdRange> splits = idRange.split(3);
		for (IdRange idRange2 : splits) {
			System.out.println(idRange2);
		}
	}
}
