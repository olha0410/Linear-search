public int linearSearch(int element, int[] list) {
    for (int i=0; i<list.length; i++) {
      if (element == list[i]) {
        return i+1;
      }
    }
   return -1;
  }