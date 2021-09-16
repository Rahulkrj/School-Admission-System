package ClassAllotment;


import Comman.Input.InputService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassAllotmentService {
    private static int classAllotId = 1;
    private static Map<Integer, ClassAllotModel> classAllotMap = new HashMap<>();
    private InputService inputService = new InputService();


    public void classAllot(){
        ClassAllotModel classAllotModel = inputService.classAllotInput();
        boolean status  = saveClassAllot(classAllotModel);
        if (status){
            System.out.println("Class allotted! ");
        }
    }

    private boolean saveClassAllot(ClassAllotModel classAllotModel) {
        classAllotModel.setClassAllotId(classAllotId);
        classAllotMap.put(classAllotId, classAllotModel);
        classAllotId++;
        return true;
    }

    public void getAllottedClass() {
        Set<Integer> keySet = classAllotMap.keySet();
        for (Integer key : keySet) {
            System.out.println(classAllotMap.get(key));
        }

    }
}
