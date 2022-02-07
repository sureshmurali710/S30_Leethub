/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer, Employee> map;
    int result = 0;
    public int getImportance(List<Employee> employees, int id) {
        if(employees == null) return 0;
        
        
        map = new HashMap<>();
        
        for(Employee e:employees){
            map.put(e.id, e);
        }
        
        
        dfs(id);
        return result;
    }
    
    private void dfs(int id){
        //base
        
        //logic
        Employee e = map.get(id);
        
        result += e.importance;
        
        for(int subId :  e.subordinates){
            dfs(subId);
        }
    }
    
    
}