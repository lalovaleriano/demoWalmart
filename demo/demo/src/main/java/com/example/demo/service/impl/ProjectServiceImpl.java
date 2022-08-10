package com.example.demo.service.impl;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.DataListDTO;
import com.example.demo.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	public Integer getMaxValue(final DataListDTO dataObject) {
		Integer maxValue = responseConStreams(dataObject.getData());
		//Integer maxValue = responseConIteracion(dataObject.getData());

		return maxValue;
	}

	private Integer responseConStreams(List<Integer> lst) {
		return lst.stream().max(Comparator.naturalOrder()).get();
	}

	private Integer responseConIteracion(List<Integer> lst) {
		int max = lst.get(0);
		for (Integer num : lst) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
