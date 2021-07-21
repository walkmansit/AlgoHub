package Algorithms.Sort

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class CombSortingTest {
    @Test
    fun insertionSortTest_isEmpty(){
        assert(combSort(arrayOf()).isEmpty())
    }

    @Test
    fun insertionSortTest_SingleElement(){
        assertContentEquals(arrayOf(5), combSort(arrayOf(5)))
    }

    @Test
    fun insertionSortTest_SameElements(){
        assertContentEquals(arrayOf(5,5,5,5), combSort(arrayOf(5,5,5,5)))
    }

    @Test
    fun insertionSortTest_Casual(){
        assertContentEquals(arrayOf(0,1,2,3,4,5), combSort(arrayOf(5,4,3,2,1,0)))
    }

    @Test
    fun insertionSortTest_CasualWithDuplicate(){
        assertContentEquals(arrayOf(0,0,1,1,2,2,3,3,4,4,5,5), combSort(arrayOf(5,0,4,3,5,2,1,4,0,3,1,2)))
    }
}