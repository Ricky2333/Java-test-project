// 编写类 `Search`，定义方法 `find`，实现查找某字符串是否在字符串数组中，井返回索引；如果找不到，返回 -1
public class Homework02 {
    public static void main(String[] args) {
        String s = "Ricky";
        String[] arr = {"Sam","Jack","Peter","Ricky2","Victor"};
        Search search = new Search();
        int res = search.find(s, arr);
        if(res != -1){
            System.out.println(res);
        }else{
            System.out.println("404 Not Found");
        }

    }
}

// class Search {
//     public int find(String s, String[] arr) {
//         int i;
//         for (i = 0; i < arr.length; i++) {
//             if (arr[i].equals(s) == true)
//                 break;
//         }
//         if (i == arr.length){
//             return -1;
//         }else{
//             return i;
//         }
//     }
// }

class Search {
    public int find(String s, String[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(s) == true)
                return i;
        }
        return -1;
    }
}
