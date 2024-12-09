package Traingle_Casification_class_1.Traingle_Casification_class_1;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    
    TriangleClassifier triangle = new TriangleClassifier();
    
    @Test
    public void testColumn1_NotTriangle() {
        int a = 5;
        int b = 2;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn2_NotTriangle() {
        int a = 2;
        int b = 5;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn3_NotTriangle() {
        int a = 2;
        int b = 2;
        int c = 5;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn4_Equilateral() {
        int a = 3;
        int b = 3;
        int c = 3;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn5_Impossible() {
        int a = 2;
        int b = 2;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn6_Impossible() {
        int a = 3;
        int b = 3;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn7_Isosceles() {
        int a = 3;
        int b = 3;
        int c = 4;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn8_Isosceles() {
        int a = 3;
        int b = 4;
        int c = 3;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn9_Isosceles() {
        int a = 4;
        int b = 3;
        int c = 3;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn10_Scalene() {
        int a = 3;
        int b = 4;
        int c = 5;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testColumn11_Scalene() {
        int a = 2;
        int b = 3;
        int c = 4;
        triangle.classifyTriangle(a,b,c);
        String expected = Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result);
    }
}