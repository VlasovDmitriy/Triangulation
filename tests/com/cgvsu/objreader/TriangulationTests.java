package com.cgvsu.objreader;


import com.cgvsu.model.Polygon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class TriangulationTests {
    @Test
    public void testTriangulation01() {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();

        List<Integer> vertexes1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> vertexes2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> vertexes3 = Arrays.asList(16, 23, 2354, 6);

        ArrayList<Integer> v1 = new ArrayList<>();
        v1.addAll(vertexes1);

        ArrayList<Integer> v2 = new ArrayList<>();
        v2.addAll(vertexes2);

        ArrayList<Integer> v3 = new ArrayList<>();
        v3.addAll(vertexes3);

        polygon1.setVertexIndices(v1);
        polygon2.setVertexIndices(v2);
        polygon3.setVertexIndices(v3);

        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon1);
        polygons.add(polygon2);
        polygons.add(polygon3);

        ArrayList<Polygon> result = Polygon.triangulatePolygons(polygons);

        Polygon pol1 = new Polygon();
        Polygon pol2 = new Polygon();
        Polygon pol3 = new Polygon();
        Polygon pol4 = new Polygon();
        Polygon pol5 = new Polygon();
        Polygon pol6 = new Polygon();
        Polygon pol7 = new Polygon();

        List<Integer> ver1 = Arrays.asList(1, 2, 3);ArrayList<Integer> ve1 = new ArrayList<>();ve1.addAll(ver1);
        List<Integer> ver2 = Arrays.asList(1, 3, 4);ArrayList<Integer> ve2 = new ArrayList<>();ve2.addAll(ver2);
        List<Integer> ver3 = Arrays.asList(2, 4, 5);ArrayList<Integer> ve3 = new ArrayList<>();ve3.addAll(ver3);
        List<Integer> ver4 = Arrays.asList(2, 5,6);ArrayList<Integer> ve4 = new ArrayList<>();ve4.addAll(ver4);
        List<Integer> ver5 = Arrays.asList(2,6,7);ArrayList<Integer> ve5 = new ArrayList<>();ve5.addAll(ver5);
        List<Integer> ver6 = Arrays.asList(16, 23, 2354);ArrayList<Integer> ve6 = new ArrayList<>();ve6.addAll(ver6);
        List<Integer> ver7 = Arrays.asList(16, 2354, 6);ArrayList<Integer> ve7 = new ArrayList<>();ve7.addAll(ver7);

        pol1.setVertexIndices(ve1);
        pol2.setVertexIndices(ve2);
        pol3.setVertexIndices(ve3);
        pol4.setVertexIndices(ve4);
        pol5.setVertexIndices(ve5);
        pol6.setVertexIndices(ve6);
        pol7.setVertexIndices(ve7);

        ArrayList<Polygon> expectedResult = new ArrayList<>();
        expectedResult.add(pol1);
        expectedResult.add(pol2);
        expectedResult.add(pol3);
        expectedResult.add(pol4);
        expectedResult.add(pol5);
        expectedResult.add(pol6);
        expectedResult.add(pol7);


        Assertions.assertTrue(Polygon.equals(result,expectedResult));
//        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testTriangulation02() {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();

        List<Integer> vertexes1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> vertexes2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> vertexes3 = Arrays.asList(16, 23, 2354, 6);

        ArrayList<Integer> v1 = new ArrayList<>();
        v1.addAll(vertexes1);

        ArrayList<Integer> v2 = new ArrayList<>();
        v2.addAll(vertexes2);

        ArrayList<Integer> v3 = new ArrayList<>();
        v3.addAll(vertexes3);

        polygon1.setVertexIndices(v1);
        polygon2.setVertexIndices(v2);
        polygon3.setVertexIndices(v3);

        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon1);
        polygons.add(polygon2);
        polygons.add(polygon3);

        ArrayList<Polygon> result = Polygon.triangulatePolygons(polygons);

        Polygon pol1 = new Polygon();
        Polygon pol2 = new Polygon();
        Polygon pol3 = new Polygon();
        Polygon pol4 = new Polygon();
        Polygon pol5 = new Polygon();
        Polygon pol6 = new Polygon();


        List<Integer> ver1 = Arrays.asList(1, 2, 3);ArrayList<Integer> ve1 = new ArrayList<>();ve1.addAll(ver1);
        List<Integer> ver2 = Arrays.asList(1, 3, 4);ArrayList<Integer> ve2 = new ArrayList<>();ve2.addAll(ver2);
        List<Integer> ver3 = Arrays.asList(2, 4, 5);ArrayList<Integer> ve3 = new ArrayList<>();ve3.addAll(ver3);
        List<Integer> ver4 = Arrays.asList(2, 5,6);ArrayList<Integer> ve4 = new ArrayList<>();ve4.addAll(ver4);
        List<Integer> ver5 = Arrays.asList(2,6,7);ArrayList<Integer> ve5 = new ArrayList<>();ve5.addAll(ver5);
        List<Integer> ver6 = Arrays.asList(16, 23, 2354);ArrayList<Integer> ve6 = new ArrayList<>();ve6.addAll(ver6);


        pol1.setVertexIndices(ve1);
        pol2.setVertexIndices(ve2);
        pol3.setVertexIndices(ve3);
        pol4.setVertexIndices(ve4);
        pol5.setVertexIndices(ve5);
        pol6.setVertexIndices(ve6);

        ArrayList<Polygon> expectedResult = new ArrayList<>();
        expectedResult.add(pol1);
        expectedResult.add(pol2);
        expectedResult.add(pol3);
        expectedResult.add(pol4);
        expectedResult.add(pol5);
        expectedResult.add(pol6);



        Assertions.assertFalse(Polygon.equals(result,expectedResult));
    }
    @Test
    public void testTriangulation03() {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();

        List<Integer> vertexes1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> vertexes2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> vertexes3 = Arrays.asList(16, 23, 2354, 6);

        ArrayList<Integer> v1 = new ArrayList<>();
        v1.addAll(vertexes1);

        ArrayList<Integer> v2 = new ArrayList<>();
        v2.addAll(vertexes2);

        ArrayList<Integer> v3 = new ArrayList<>();
        v3.addAll(vertexes3);

        polygon1.setVertexIndices(v1);
        polygon2.setVertexIndices(v2);
        polygon3.setVertexIndices(v3);

        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon1);
        polygons.add(polygon2);
        polygons.add(polygon3);

        ArrayList<Polygon> result = Polygon.triangulatePolygons(polygons);
        ArrayList<Polygon> expectedResult = new ArrayList<>();



        Assertions.assertFalse(Polygon.equals(result,expectedResult));
    }
    @Test
    public void testTriangulation04() {
        ArrayList<Polygon> polygons = new ArrayList<>();
        ArrayList<Polygon> result = Polygon.triangulatePolygons(polygons);
        ArrayList<Polygon> expectedResult = new ArrayList<>();
        Assertions.assertTrue(Polygon.equals(result,expectedResult));
    }
    @Test
    public void testTriangulation05() {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();

        List<Integer> vertexes1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> vertexes2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> vertexes3 = Arrays.asList(16, 23, 2354, 6);

        ArrayList<Integer> v1 = new ArrayList<>();
        v1.addAll(vertexes1);

        ArrayList<Integer> v2 = new ArrayList<>();
        v2.addAll(vertexes2);

        ArrayList<Integer> v3 = new ArrayList<>();
        v3.addAll(vertexes3);

        polygon1.setVertexIndices(v1);
        polygon2.setVertexIndices(v2);
        polygon3.setVertexIndices(v3);

        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon1);
        polygons.add(polygon2);
        polygons.add(polygon3);

        ArrayList<Polygon> result = Polygon.triangulatePolygons(polygons);

        Polygon pol1 = new Polygon();
        Polygon pol2 = new Polygon();
        Polygon pol3 = new Polygon();
        Polygon pol4 = new Polygon();
        Polygon pol5 = new Polygon();
        Polygon pol6 = new Polygon();
        Polygon pol7 = new Polygon();

        List<Integer> ver1 = Arrays.asList(554, 2, 3);ArrayList<Integer> ve1 = new ArrayList<>();ve1.addAll(ver1);
        List<Integer> ver2 = Arrays.asList(1, 3, 4);ArrayList<Integer> ve2 = new ArrayList<>();ve2.addAll(ver2);
        List<Integer> ver3 = Arrays.asList(2, 4, 5);ArrayList<Integer> ve3 = new ArrayList<>();ve3.addAll(ver3);
        List<Integer> ver4 = Arrays.asList(2, 5,6);ArrayList<Integer> ve4 = new ArrayList<>();ve4.addAll(ver4);
        List<Integer> ver5 = Arrays.asList(2,6,7);ArrayList<Integer> ve5 = new ArrayList<>();ve5.addAll(ver5);
        List<Integer> ver6 = Arrays.asList(16, 23, 2354);ArrayList<Integer> ve6 = new ArrayList<>();ve6.addAll(ver6);
        List<Integer> ver7 = Arrays.asList(16, 2354, 6);ArrayList<Integer> ve7 = new ArrayList<>();ve7.addAll(ver7);

        pol1.setVertexIndices(ve1);
        pol2.setVertexIndices(ve2);
        pol3.setVertexIndices(ve3);
        pol4.setVertexIndices(ve4);
        pol5.setVertexIndices(ve5);
        pol6.setVertexIndices(ve6);
        pol7.setVertexIndices(ve7);

        ArrayList<Polygon> expectedResult = new ArrayList<>();
        expectedResult.add(pol1);
        expectedResult.add(pol2);
        expectedResult.add(pol3);
        expectedResult.add(pol4);
        expectedResult.add(pol5);
        expectedResult.add(pol6);
        expectedResult.add(pol7);


        Assertions.assertFalse(Polygon.equals(result,expectedResult));

    }
    @Test
    public void testTriangulation06() {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();

        List<Integer> vertexes1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> vertexes2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> vertexes3 = Arrays.asList(16, 23, 2354, 6);

        List<Integer> texture1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> texture2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> texture3 = Arrays.asList(16, 23, 2354, 6);

        ArrayList<Integer> v1 = new ArrayList<>();
        v1.addAll(vertexes1);

        ArrayList<Integer> v2 = new ArrayList<>();
        v2.addAll(vertexes2);

        ArrayList<Integer> v3 = new ArrayList<>();
        v3.addAll(vertexes3);

        ArrayList<Integer> t1 = new ArrayList<>();
        t1.addAll(texture1);

        ArrayList<Integer> t2 = new ArrayList<>();
        t2.addAll(texture2);

        ArrayList<Integer> t3 = new ArrayList<>();
        t3.addAll(texture3);

        polygon1.setVertexIndices(v1);
        polygon1.setTextureVertexIndices(t1);
        polygon2.setVertexIndices(v2);
        polygon2.setTextureVertexIndices(t2);
        polygon3.setVertexIndices(v3);
        polygon3.setTextureVertexIndices(t3);

        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon1);
        polygons.add(polygon2);
        polygons.add(polygon3);

        ArrayList<Polygon> result = Polygon.triangulatePolygons(polygons);

        Polygon pol1 = new Polygon();
        Polygon pol2 = new Polygon();
        Polygon pol3 = new Polygon();
        Polygon pol4 = new Polygon();
        Polygon pol5 = new Polygon();
        Polygon pol6 = new Polygon();
        Polygon pol7 = new Polygon();

        List<Integer> ver1 = Arrays.asList(1, 2, 3);ArrayList<Integer> ve1 = new ArrayList<>();ve1.addAll(ver1);
        List<Integer> ver2 = Arrays.asList(1, 3, 4);ArrayList<Integer> ve2 = new ArrayList<>();ve2.addAll(ver2);
        List<Integer> ver3 = Arrays.asList(2, 4, 5);ArrayList<Integer> ve3 = new ArrayList<>();ve3.addAll(ver3);
        List<Integer> ver4 = Arrays.asList(2, 5,6);ArrayList<Integer> ve4 = new ArrayList<>();ve4.addAll(ver4);
        List<Integer> ver5 = Arrays.asList(2,6,7);ArrayList<Integer> ve5 = new ArrayList<>();ve5.addAll(ver5);
        List<Integer> ver6 = Arrays.asList(16, 23, 2354);ArrayList<Integer> ve6 = new ArrayList<>();ve6.addAll(ver6);
        List<Integer> ver7 = Arrays.asList(16, 2354, 6);ArrayList<Integer> ve7 = new ArrayList<>();ve7.addAll(ver7);

        List<Integer> ter1 = Arrays.asList(1, 2, 3);ArrayList<Integer> te1 = new ArrayList<>();te1.addAll(ter1);
        List<Integer> ter2 = Arrays.asList(1, 3, 4);ArrayList<Integer> te2 = new ArrayList<>();te2.addAll(ter2);
        List<Integer> ter3 = Arrays.asList(2, 4, 5);ArrayList<Integer> te3 = new ArrayList<>();te3.addAll(ter3);
        List<Integer> ter4 = Arrays.asList(2, 5,6);ArrayList<Integer> te4 = new ArrayList<>();te4.addAll(ter4);
        List<Integer> ter5 = Arrays.asList(2,6,7);ArrayList<Integer> te5 = new ArrayList<>();te5.addAll(ter5);
        List<Integer> ter6 = Arrays.asList(16, 23, 2354);ArrayList<Integer> te6 = new ArrayList<>();te6.addAll(ter6);
        List<Integer> ter7 = Arrays.asList(16, 2354, 6);ArrayList<Integer> te7 = new ArrayList<>();te7.addAll(ter7);

        pol1.setVertexIndices(ve1);
        pol1.setTextureVertexIndices(te1);
        pol2.setVertexIndices(ve2);
        pol2.setTextureVertexIndices(te2);
        pol3.setVertexIndices(ve3);
        pol3.setTextureVertexIndices(te3);
        pol4.setVertexIndices(ve4);
        pol4.setTextureVertexIndices(te4);
        pol5.setVertexIndices(ve5);
        pol5.setTextureVertexIndices(te5);
        pol6.setVertexIndices(ve6);
        pol6.setTextureVertexIndices(te6);
        pol7.setVertexIndices(ve7);
        pol7.setTextureVertexIndices(te7);

        ArrayList<Polygon> expectedResult = new ArrayList<>();
        expectedResult.add(pol1);
        expectedResult.add(pol2);
        expectedResult.add(pol3);
        expectedResult.add(pol4);
        expectedResult.add(pol5);
        expectedResult.add(pol6);
        expectedResult.add(pol7);


        Assertions.assertTrue(Polygon.equals(result,expectedResult));

    }

    @Test
    public void testTriangulation07() {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();

        List<Integer> vertexes1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> vertexes2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> vertexes3 = Arrays.asList(16, 23, 2354, 6);

        List<Integer> texture1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> texture2 = Arrays.asList(2, 4, 5, 6, 7);
        List<Integer> texture3 = Arrays.asList(16, 23, 2354, 6);

        ArrayList<Integer> v1 = new ArrayList<>();
        v1.addAll(vertexes1);

        ArrayList<Integer> v2 = new ArrayList<>();
        v2.addAll(vertexes2);

        ArrayList<Integer> v3 = new ArrayList<>();
        v3.addAll(vertexes3);

        ArrayList<Integer> t1 = new ArrayList<>();
        t1.addAll(texture1);

        ArrayList<Integer> t2 = new ArrayList<>();
        t2.addAll(texture2);

        ArrayList<Integer> t3 = new ArrayList<>();
        t3.addAll(texture3);

        polygon1.setVertexIndices(v1);
        polygon1.setTextureVertexIndices(t1);
        polygon2.setVertexIndices(v2);
        polygon2.setTextureVertexIndices(t2);
        polygon3.setVertexIndices(v3);
        polygon3.setTextureVertexIndices(t3);

        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(polygon1);
        polygons.add(polygon2);
        polygons.add(polygon3);

        ArrayList<Polygon> result = Polygon.triangulatePolygons(polygons);

        Polygon pol1 = new Polygon();
        Polygon pol2 = new Polygon();
        Polygon pol3 = new Polygon();
        Polygon pol4 = new Polygon();
        Polygon pol5 = new Polygon();
        Polygon pol6 = new Polygon();
        Polygon pol7 = new Polygon();

        List<Integer> ver1 = Arrays.asList(1, 2, 3);ArrayList<Integer> ve1 = new ArrayList<>();ve1.addAll(ver1);
        List<Integer> ver2 = Arrays.asList(1, 3, 4);ArrayList<Integer> ve2 = new ArrayList<>();ve2.addAll(ver2);
        List<Integer> ver3 = Arrays.asList(2, 4, 5);ArrayList<Integer> ve3 = new ArrayList<>();ve3.addAll(ver3);
        List<Integer> ver4 = Arrays.asList(2, 5,6);ArrayList<Integer> ve4 = new ArrayList<>();ve4.addAll(ver4);
        List<Integer> ver5 = Arrays.asList(2,6,7);ArrayList<Integer> ve5 = new ArrayList<>();ve5.addAll(ver5);
        List<Integer> ver6 = Arrays.asList(16, 23, 2354);ArrayList<Integer> ve6 = new ArrayList<>();ve6.addAll(ver6);
        List<Integer> ver7 = Arrays.asList(16, 2354, 6);ArrayList<Integer> ve7 = new ArrayList<>();ve7.addAll(ver7);

        List<Integer> ter1 = Arrays.asList(55, 2, 3);ArrayList<Integer> te1 = new ArrayList<>();te1.addAll(ter1);
        List<Integer> ter2 = Arrays.asList(1, 3, 4);ArrayList<Integer> te2 = new ArrayList<>();te2.addAll(ter2);
        List<Integer> ter3 = Arrays.asList(2, 4, 5);ArrayList<Integer> te3 = new ArrayList<>();te3.addAll(ter3);
        List<Integer> ter4 = Arrays.asList(2, 5,6);ArrayList<Integer> te4 = new ArrayList<>();te4.addAll(ter4);
        List<Integer> ter5 = Arrays.asList(2,6,7);ArrayList<Integer> te5 = new ArrayList<>();te5.addAll(ter5);
        List<Integer> ter6 = Arrays.asList(16, 23, 2354);ArrayList<Integer> te6 = new ArrayList<>();te6.addAll(ter6);
        List<Integer> ter7 = Arrays.asList(16, 2354, 6);ArrayList<Integer> te7 = new ArrayList<>();te7.addAll(ter7);

        pol1.setVertexIndices(ve1);
        pol1.setTextureVertexIndices(te1);
        pol2.setVertexIndices(ve2);
        pol2.setTextureVertexIndices(te2);
        pol3.setVertexIndices(ve3);
        pol3.setTextureVertexIndices(te3);
        pol4.setVertexIndices(ve4);
        pol4.setTextureVertexIndices(te4);
        pol5.setVertexIndices(ve5);
        pol5.setTextureVertexIndices(te5);
        pol6.setVertexIndices(ve6);
        pol6.setTextureVertexIndices(te6);
        pol7.setVertexIndices(ve7);
        pol7.setTextureVertexIndices(te7);

        ArrayList<Polygon> expectedResult = new ArrayList<>();
        expectedResult.add(pol1);
        expectedResult.add(pol2);
        expectedResult.add(pol3);
        expectedResult.add(pol4);
        expectedResult.add(pol5);
        expectedResult.add(pol6);
        expectedResult.add(pol7);


        Assertions.assertFalse(Polygon.equals(result,expectedResult));

    }






}
