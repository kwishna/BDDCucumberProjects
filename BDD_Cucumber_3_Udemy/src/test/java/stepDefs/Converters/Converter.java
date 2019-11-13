package stepDefs.Converters;

import java.time.LocalDate;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Converter implements TypeRegistryConfigurer{

	@Override
	public Locale locale() {
		// TODO Auto-generated method stub
		return Locale.ENGLISH;
	}
	
//	2nd Method
//	@Override
//	public void configureTypeRegistry(TypeRegistry typeRegistry) {
//		
//		  	Transformer transformer = new Transformer();
//	        typeRegistry.setDefaultDataTableCellTransformer(transformer);
//	        typeRegistry.setDefaultDataTableEntryTransformer(transformer);
//	        typeRegistry.setDefaultParameterTransformer(transformer);
//	    }
//	
//	   class Transformer implements ParameterByTypeTransformer, TableEntryByTypeTransformer, TableCellByTypeTransformer {
//	        ObjectMapper objectMapper = new ObjectMapper();
//
//			@Override
//			public <T> T transform(String value, Class<T> cellType) throws Throwable {
//				return objectMapper.convertValue(value, objectMapper.constructType(cellType));
//			}
//
//			@Override
//			public <T> T transform(Map<String, String> entry, Class<T> type, TableCellByTypeTransformer cellTransformer)
//					throws Throwable {
//				return objectMapper.convertValue(entry, type);
//			}
//
//			@Override
//			public Object transform(String fromValue, Type toValueType) throws Throwable {
//				return objectMapper.convertValue(fromValue, objectMapper.constructType(toValueType));
//			}
	
	@Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(
            LocalDate.class,
            (List<String> row) -> LocalDate.parse(row.get(0))
        ));

	}
}

 //1st Method
//	@Override
//	public void configureTypeRegistry(TypeRegistry typeRegistry) {
//		
//		typeRegistry.defineParameterType(new ParameterType<Date>("Date",
//				"[([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))]",
//				Date.class,
//				Date::new
//				));
//		
//	}
	   
	   
	   
//		@Override
//		public void configureTypeRegistry(TypeRegistry typeRegistry) {
//			
//			typeRegistry.defineParameterType(new ParameterType<LocalDate>("LocalDate",
//					"[([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))]",
//					LocalDate.class,
//					new Transformer<LocalDate>() {
//						@Override
//						public LocalDate transform(String s) throws Throwable {
//							return LocalDate.parse(s);
//						}
//					}
//					));
//			
//		}
	
	
//	@Override
//	public void configureTypeRegistry(TypeRegistry typeRegistry) {
//		
//		typeRegistry.defineParameterType(new ParameterType<Date>("LocalDate",
//				"[([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))]",
//				Date.class,
//				new Transformer<Date>() {
//					@Override
//					public Date transform(String s) throws Throwable {
//						return new Date(s);
//					}
//				}
//				));
//	}