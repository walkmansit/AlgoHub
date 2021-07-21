package Algorithms.Sort

fun shakerSort(array: Array<Int>) :Array<Int> {

    var left = 0
    var right = array.size - 1

    while (left<=right){
        for (i in left until right){
            if (array[i]>array[i+1]){
                swap(array,i,i+1)
            }
        }
        right--

        for (i in right downTo left+1){
            if (array[i]<array[i-1]){
                swap(array,i,i-1)
            }
        }
        left++
    }

    return array
}