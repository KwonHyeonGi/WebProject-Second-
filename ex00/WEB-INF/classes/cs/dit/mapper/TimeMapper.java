package cs.dit.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("select now()")
	public String getTime01();
	
	public String getTime02();
}
