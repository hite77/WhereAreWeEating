package whereareweeating.com.hiteware.whereareweeating;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * Created on 6/9/15.
 */
public class InjectableApplication extends Application {

    private ProductionModule productionModule = null;
    private ObjectGraph graph = null;
    protected Object mockLocationManagerModule;

    private void buildGraph()
    {
        if (graph == null)
        {
            if (useMockSensorManager) {
                graph = ObjectGraph.create(mockLocationManagerModule);
            } else {
                if (productionModule == null)
                    productionModule = new ProductionModule(this);
                graph = ObjectGraph.create(productionModule);
            }
        }
    }
//
    public void inject(Object object)
    {
        buildGraph();
        graph.inject(object);
    }
//
//    public void addToGraph(Object module) {
//        buildGraph();
//        graph = graph.plus(module);
//    }
}