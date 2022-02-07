/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    
    public int getImportance(List<Employee> employees, int id) {
        if(employees == null) return 0;
        
        int result = 0;
        HashMap<Integer, Employee> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(Employee e:employees){
            map.put(e.id, e);
        }
        
        
        q.add(id);
     
        while(!q.isEmpty()){
            
            int curr = q.poll();
            Employee e = map.get(curr);
            result += e.importance;
            for(int subId :  e.subordinates){
                q.add(subId);
            }
        }
        
        return result;
    }
    
  
    
    
}