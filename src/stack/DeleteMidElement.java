package stack;

import java.util.Stack;
import java.util.Vector;

public class DeleteMidElement {

    public static void deleteMidElementFromStack(){
        Stack<Character> st = new Stack<>();
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        Vector<Character> vector =  new Vector<>();
        int n = st.size() ;

        System.out.println(n);

        for (int i = 0; i<n; i++){
                char c = st.pop();
                System.out.println(i + " " + n);
                vector.add(c);
        }
        int target = (int) Math.ceil(n / 2);
        for (int i=0; i<vector.size();i++){
            if(i==target)
                continue;
            st.push(vector.elementAt(i));
        }
        while (!st.empty()){
            System.out.print(st.pop() + " ");
        }
    }
}
