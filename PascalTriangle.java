import java.util.ArrayList;
import java.util.List;

class PascalTriangle{
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));
        for(int i = 0; i < numRows - 1; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(ans.get(ans.size() - 1));
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < temp.size() - 1; j++){
                row.add(temp.get(j) + temp.get(j + 1));
            }
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for(List<Integer> li : list){
            for(int i = 0; i < li.size(); i++){
                System.out.print(li.get(i) + " ");
            }
            System.out.println();
        }
    }
}