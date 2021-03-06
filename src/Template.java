
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
     * @param fields_map
     * @return Field
     */
    public Field create_Fields(String filename, Map<String, String> fields_map){
        return null;
    }

    /**
     * Method: find
     * This method finds and returns the field value according to previous file locations
     * @param filename
     * @return field_value
     */
    public void create_Entry(String filename){}

    /**
     * Method: fix
     * This method finds every occurrence of the field_value and assigns it to the existing field as new
     * possible locations for future documents
     * @param filename
     * @param field_name
     * @param field_value
     */
    public void updateField(String filename, String field_name, String field_value){
    }

}
