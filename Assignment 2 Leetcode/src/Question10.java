public class Question10 {

        public int compress(char[] chars) {
            int n = chars.length;
            int s = 0, e = 0, count = 0;
            Character comp = null;

            while(e < n){
                if(comp == null || comp == chars[e]){
                    if(comp == null) comp = chars[e];
                    count++;
                    e++;
                }
                else{
                    if(count == 1){
                        chars[s++] = comp;
                    }
                    else{
                        chars[s++] = comp;
                        for(char i: Integer.toString(count).toCharArray()){
                            chars[s++] = i;
                        }
                    }
                    count = 0;
                    comp = null;
                }
            }

            if(count != 0){
                if(count == 1){
                    chars[s++] = comp;
                }
                else{
                    chars[s++] = comp;
                    for(char i: Integer.toString(count).toCharArray()) chars[s++] = i;
                }
            }

            return s;
        }
    }
