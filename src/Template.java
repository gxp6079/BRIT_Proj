
import java.util.Map;

public class Template {

    private Map<String, Field> fields;

    /**
     * For the creation of a Template we need a file and a map to each field name and value
     * it should call create_Field for every field name
     * @param filename
     * @param fields_map
     */
    public Template(String filename, Map<String, String> fields_map){
    }

    /**
     * Method: create_Field
     * This method finds every occurrence of the field_value and assigns it to a new Field
     * @param filename
     * @param field_value
     * @return Field
     */
    public Field create_Field(String filename, String field_value){
        return null;
    }

    /**
     * Method: find
     * This method finds and returns the field value according to previous file locations
     * @param filename
     * @param field_name
     * @return field_value
     */
    public String find(String filename, String field_name){
        return null;
    }

    /**
     * Method: fix
     * This method finds every occurrence of the field_value and assigns it to the existing field as new
     * possible locations for future documents
     * @param filename
     * @param field_name
     * @param field_value
     */
    public void fix(String filename, String field_name, String field_value){
    }

    /**
    Method: sendTo_DB
    This method send found field values to database after validated
     */
    public void sendToDB(){
    }
}
