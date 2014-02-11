package com.mysema.query.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.mysema.query.BeanPopulationBase;
import com.mysema.query.Connections;
import com.mysema.query.DeleteBase;
import com.mysema.query.InsertBase;
import com.mysema.query.LikeEscapeBase;
import com.mysema.query.MergeBase;
import com.mysema.query.SelectBase;
import com.mysema.query.SelectBaseUseLiterals;
import com.mysema.query.SpatialBase;
import com.mysema.query.SubqueriesBase;
import com.mysema.query.TypesBase;
import com.mysema.query.UnionBase;
import com.mysema.query.UpdateBase;
import com.mysema.query.sql.spatial.TeradataSpatialTemplates;
import com.mysema.testutil.ExternalDB;

@Category(ExternalDB.class)
public class TeradataSuiteTest extends AbstractSuite {

    public static class BeanPopulation extends BeanPopulationBase {}
    public static class Delete extends DeleteBase {}
    public static class Insert extends InsertBase {}
    public static class LikeEscape extends LikeEscapeBase {}
    public static class Merge extends MergeBase {}
    public static class Select extends SelectBase {}
    public static class SelectUseLiterals extends SelectBaseUseLiterals {}
    public static class Spatial extends SpatialBase {}
    public static class Subqueries extends SubqueriesBase {}
    public static class Types extends TypesBase {}
    public static class Union extends UnionBase {}
    public static class Update extends UpdateBase {}

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initTeradata();
        Connections.setTemplates(TeradataSpatialTemplates.builder().newLineToSingleSpace().build());
    }

}
