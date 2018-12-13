/** @param str the string to encode using the master string
     *  Precondition: all of the characters in str appear in the master string;
     *  str.length() > 0
     *  @return a string part in the master string that matches the beginning of str.
     *  The returned string part has length at least 1 and largest 5. 
     *  The method gives prefernce to return the longer matches.
     */
    private StringPart findPart(String str){
        int n = str.length();
        int index = 0;
        while (n != 0){
            index = materPhrase.IndexOf(str.subtring(0,n));
            if(index == -1){
            n --;
            }    
            else {
            return new StringPart(index,n)
            }
        
