package com.orch;

public enum SearchTypeEnum {

	BRAND("brand"), TYPE("type");
	
	private String searchType;
	
	SearchTypeEnum(String searchType){
		this.searchType = searchType;
	}

	public String getSearchType() {
		return searchType;
	}	
	
	public SearchTypeEnum getInstance(String searchType){
		return SearchTypeEnum.valueOf(searchType);
	}
}
