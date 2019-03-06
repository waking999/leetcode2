package easy.e0155minstack;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MinStackTest {
    @Test
    public void test1() {
        int expect;
        int output;
        int seq = 1;

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        output = minStack.getMin();
        expect = -3;
        VerifyUtil.verify(expect, output, seq++);
        minStack.pop();
        output = minStack.top();
        expect = 0;
        VerifyUtil.verify(expect, output, seq++);
        output = minStack.getMin();
        expect = -2;
        VerifyUtil.verify(expect, output, seq++);
    }

    @Test
    public void test2() {
        String[] operations;
        int[][] parameters;
        Integer[] expect;

        operations = new String[]{"MinStack", "push", "push", "getMin", "getMin", "push", "getMin", "getMin", "top",
                "getMin", "pop", "push", "push", "getMin", "push", "pop", "top", "getMin", "pop"};

        parameters = new int[][]{{}, {-10}, {14}, {}, {}, {-20}, {}, {}, {}, {}, {}, {10}, {-7}, {}, {-7},
                {}, {}, {}, {}};
        expect = new Integer[]{null, null, null, -10, -10, null, -20, -20, -20, -20, null, null, null, -10, null,
                null, -7, -10, null};
        runAndVerify(operations, parameters, expect, 3);

        operations = new String[]{"MinStack", "push", "getMin", "top", "getMin", "push", "push", "getMin", "push",
                "getMin", "pop", "push", "push", "getMin", "push", "top", "push", "pop", "pop", "getMin", "pop",
                "getMin", "getMin", "pop", "getMin", "push", "push", "pop", "push", "getMin", "getMin", "push",
                "getMin", "getMin", "push", "getMin", "getMin", "getMin", "push", "getMin", "pop", "top", "push", "top",
                "push", "getMin", "getMin", "push", "pop", "getMin", "getMin", "pop", "pop", "getMin", "push", "getMin",
                "getMin", "push", "getMin", "top", "getMin", "push", "getMin", "push", "top", "getMin", "push",
                "getMin", "top", "getMin", "push", "getMin", "getMin", "push", "pop", "push", "push", "getMin", "push",
                "push", "push", "top", "getMin", "push", "getMin", "push", "push", "push", "getMin", "push", "push",
                "push", "pop", "push", "getMin", "top", "getMin", "getMin", "push", "top", "push", "push", "top",
                "push", "getMin", "push", "top", "getMin", "getMin", "getMin", "getMin", "getMin", "push", "getMin",
                "push", "push", "getMin", "getMin", "getMin", "top", "getMin", "push", "pop", "getMin", "getMin",
                "push", "getMin", "getMin", "getMin", "getMin", "push", "top", "top", "push", "push", "push", "top",
                "top", "push", "getMin", "push", "push", "push", "getMin", "getMin", "push", "push", "push", "push",
                "getMin", "getMin", "getMin", "push", "top", "pop", "getMin", "push", "top", "pop", "push", "getMin",
                "pop", "getMin", "pop", "getMin", "push", "top", "push", "getMin", "getMin", "top", "pop", "top",
                "getMin", "getMin", "push", "push", "push", "pop", "push", "getMin", "getMin", "push", "push", "push",
                "top", "getMin", "top", "getMin", "getMin", "top", "top", "pop", "pop", "getMin", "getMin", "push",
                "getMin", "push", "getMin", "push", "push", "push", "getMin", "pop", "pop", "push", "pop", "top",
                "push", "top", "top", "pop", "top", "push", "push", "top", "top", "getMin", "getMin", "getMin", "push",
                "getMin", "getMin", "push", "getMin", "pop", "top", "push", "push", "push", "push", "push", "getMin",
                "getMin", "push", "getMin", "getMin", "getMin", "push", "getMin", "getMin", "getMin", "top", "getMin",
                "getMin", "push", "top", "getMin", "push", "getMin", "push", "getMin", "getMin", "getMin", "push",
                "pop", "push", "pop", "push", "top", "getMin", "getMin", "push", "getMin", "getMin", "getMin", "push",
                "push", "push", "getMin", "push", "top", "push", "getMin", "push", "top", "getMin", "getMin", "getMin",
                "pop", "getMin", "top", "getMin", "push", "getMin", "getMin", "getMin", "getMin", "getMin", "pop",
                "getMin", "getMin", "push", "getMin", "pop", "push", "top", "push", "push", "getMin", "pop", "pop",
                "push", "pop", "getMin", "push", "push", "getMin", "getMin", "pop", "pop", "pop", "push", "pop", "push",
                "push", "push", "push", "getMin", "top", "getMin", "getMin", "getMin", "top", "push", "getMin", "push",
                "push", "getMin", "pop", "getMin", "push", "pop", "pop", "push", "push", "push", "pop", "getMin",
                "getMin", "pop", "push", "push", "getMin", "top", "getMin", "pop", "push", "push", "push", "getMin",
                "getMin", "push", "push", "push", "getMin", "pop", "getMin", "push", "push", "getMin", "getMin",
                "getMin", "push", "getMin", "getMin", "getMin", "getMin", "getMin", "getMin", "push", "getMin", "pop",
                "getMin", "getMin", "push", "pop", "pop", "pop", "push", "top", "push", "push", "getMin", "getMin",
                "getMin", "getMin", "getMin", "push", "push", "top", "push", "top", "push", "top", "pop", "push",
                "getMin", "push", "push", "getMin", "getMin", "getMin", "getMin", "pop", "getMin", "push", "top", "pop",
                "push", "getMin", "push", "push", "push", "push", "pop", "getMin", "push", "push", "top", "getMin",
                "getMin", "top", "getMin", "getMin", "push", "getMin", "push", "getMin", "top", "getMin", "getMin",
                "push", "push", "getMin", "push", "push", "push", "push", "getMin", "getMin", "pop", "push", "top",
                "push", "pop", "getMin", "push", "push", "getMin", "getMin", "push", "getMin", "push", "push", "getMin",
                "getMin", "getMin", "top", "getMin", "getMin", "push", "top", "push", "top", "pop", "push", "push",
                "getMin", "push", "pop", "pop", "push", "getMin", "push", "getMin", "getMin", "getMin", "top", "top",
                "pop", "pop", "pop", "getMin", "push", "top", "push", "getMin", "getMin", "getMin", "push", "getMin",
                "top", "getMin", "push", "push", "getMin", "pop", "getMin"};

        parameters = new int[][]{{}, {395}, {}, {}, {}, {276}, {29}, {}, {-482}, {}, {}, {-108}, {-251},
                {}, {-439}, {}, {370}, {}, {}, {}, {}, {}, {}, {}, {}, {-158}, {82}, {}, {-176}, {}, {},
                {-90}, {}, {}, {411}, {}, {}, {}, {-494}, {}, {}, {}, {155}, {}, {-370}, {}, {}, {273}, {},
                {}, {}, {}, {}, {}, {173}, {}, {}, {0}, {}, {}, {}, {-266}, {}, {-359}, {}, {}, {189}, {}, {},
                {}, {375}, {}, {}, {-188}, {}, {-275}, {-223}, {}, {294}, {380}, {-42}, {}, {}, {33},
                {}, {457}, {422}, {-352}, {}, {326}, {-378}, {231}, {}, {416}, {}, {}, {}, {}, {277},
                {}, {472}, {205}, {}, {-443}, {}, {-5}, {}, {}, {}, {}, {}, {}, {-312}, {}, {-249},
                {-209}, {}, {}, {}, {}, {}, {196}, {}, {}, {}, {-347}, {}, {}, {}, {}, {400}, {}, {}, {269},
                {434}, {-213}, {}, {}, {-58}, {}, {-353}, {-426}, {-335}, {}, {}, {-188}, {-388},
                {369}, {319}, {}, {}, {}, {121}, {}, {}, {}, {155}, {}, {}, {155}, {}, {}, {}, {}, {},
                {495}, {}, {-53}, {}, {}, {}, {}, {}, {}, {}, {465}, {162}, {-334}, {}, {282}, {}, {},
                {432}, {-418}, {195}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {374}, {}, {202}, {},
                {181}, {173}, {-323}, {}, {}, {}, {-430}, {}, {}, {346}, {}, {}, {}, {}, {244}, {-467},
                {}, {}, {}, {}, {}, {279}, {}, {}, {-30}, {}, {}, {}, {264}, {-217}, {-418}, {12}, {-439},
                {}, {}, {7}, {}, {}, {}, {-189}, {}, {}, {}, {}, {}, {}, {303}, {}, {}, {-297}, {}, {-21}, {},
                {}, {}, {461}, {}, {-303}, {}, {-338}, {}, {}, {}, {-42}, {}, {}, {}, {85}, {132}, {57},
                {}, {-17}, {}, {-10}, {}, {-500}, {}, {}, {}, {}, {}, {}, {}, {}, {-7}, {}, {}, {}, {}, {}, {},
                {}, {}, {346}, {}, {}, {16}, {}, {472}, {-211}, {}, {}, {}, {-381}, {}, {}, {214}, {169},
                {}, {}, {}, {}, {}, {33}, {}, {115}, {-346}, {-309}, {130}, {}, {}, {}, {}, {}, {}, {335},
                {}, {-92}, {-16}, {}, {}, {}, {-470}, {}, {}, {250}, {327}, {144}, {}, {}, {}, {}, {359},
                {138}, {}, {}, {}, {}, {272}, {-241}, {-362}, {}, {}, {-83}, {195}, {-208}, {}, {}, {},
                {-500}, {5}, {}, {}, {}, {284}, {}, {}, {}, {}, {}, {}, {477}, {}, {}, {}, {}, {30}, {}, {},
                {}, {-269}, {}, {-413}, {-323}, {}, {}, {}, {}, {}, {217}, {-408}, {}, {-353}, {}, {-142},
                {}, {}, {-321}, {}, {-33}, {382}, {}, {}, {}, {}, {}, {}, {298}, {}, {}, {495}, {}, {195},
                {-147}, {-85}, {195}, {}, {}, {154}, {-311}, {}, {}, {}, {}, {}, {}, {-390}, {}, {323},
                {}, {}, {}, {}, {338}, {263}, {}, {160}, {148}, {142}, {427}, {}, {}, {}, {-153}, {},
                {-384}, {}, {}, {159}, {419}, {}, {}, {-385}, {}, {461}, {-346}, {}, {}, {}, {}, {}, {},
                {343}, {}, {-269}, {}, {}, {-401}, {81}, {}, {130}, {}, {}, {-428}, {}, {454}, {}, {}, {},
                {}, {}, {}, {}, {}, {}, {59}, {}, {143}, {}, {}, {}, {-154}, {}, {}, {}, {114}, {-346}, {},
                {}, {}};

        expect = new Integer[]{null, null, 395, 395, 395, null, null, 29, null, -482, null, null, null, -251, null,
                -439, null, null, null, -251, null, -108, -108, null, 29, null, null, null, null, -176, -176, null,
                -176, -176, null, -176, -176, -176, null, -494, null, 411, null, 155, null, -370, -370, null, null,
                -370, -370, null, null, -176, null, -176, -176, null, -176, 0, -176, null, -266, null, -359, -359, null,
                -359, 189, -359, null, -359, -359, null, null, null, null, -359, null, null, null, -42, -359, null,
                -359, null, null, null, -359, null, null, null, null, null, -378, 416, -378, -378, null, 277, null,
                null, 205, null, -443, null, -5, -443, -443, -443, -443, -443, null, -443, null, null, -443, -443, -443,
                -209, -443, null, null, -443, -443, null, -443, -443, -443, -443, null, 400, 400, null, null, null,
                -213, -213, null, -443, null, null, null, -443, -443, null, null, null, null, -443, -443, -443, null,
                121, null, -443, null, 155, null, null, -443, null, -443, null, -443, null, 495, null, -443, -443, -53,
                null, 495, -443, -443, null, null, null, null, null, -443, -443, null, null, null, 195, -443, 195, -443,
                -443, 195, 195, null, null, -443, -443, null, -443, null, -443, null, null, null, -443, null, null,
                null, null, 181, null, 346, 346, null, 181, null, null, -467, -467, -467, -467, -467, null, -467, -467,
                null, -467, null, 279, null, null, null, null, null, -467, -467, null, -467, -467, -467, null, -467,
                -467, -467, -189, -467, -467, null, 303, -467, null, -467, null, -467, -467, -467, null, null, null,
                null, null, -338, -467, -467, null, -467, -467, -467, null, null, null, -467, null, -17, null, -467,
                null, -500, -500, -500, -500, null, -467, -10, -467, null, -467, -467, -467, -467, -467, null, -467,
                -467, null, -467, null, null, 16, null, null, -467, null, null, null, null, -467, null, null, -467,
                -467, null, null, null, null, null, null, null, null, null, -467, 130, -467, -467, -467, 130, null,
                -467, null, null, -467, null, -467, null, null, null, null, null, null, null, -467, -467, null, null,
                null, -467, 138, -467, null, null, null, null, -467, -467, null, null, null, -467, null, -467, null,
                null, -500, -500, -500, null, -500, -500, -500, -500, -500, -500, null, -500, null, -500, -500, null,
                null, null, null, null, -269, null, null, -500, -500, -500, -500, -500, null, null, -408, null, -353,
                null, -142, null, null, -500, null, null, -500, -500, -500, -500, null, -500, null, 298, null, null,
                -500, null, null, null, null, null, -500, null, null, -311, -500, -500, -311, -500, -500, null, -500,
                null, -500, 323, -500, -500, null, null, -500, null, null, null, null, -500, -500, null, null, -153,
                null, null, -500, null, null, -500, -500, null, -500, null, null, -500, -500, -500, -346, -500, -500,
                null, 343, null, -269, null, null, null, -500, null, null, null, null, -500, null, -500, -500, -500,
                454, 454, null, null, null, -500, null, 59, null, -500, -500, -500, null, -500, -154, -500, null, null,
                -500, null, -500};

        runAndVerify(operations, parameters, expect, 4);

        System.out.println("Finish");

    }

    private static void runAndVerify(String[] operations, int[][] parameters, Integer[] expect, int caseNo) {
        int opLen = operations.length;
        int parLen = parameters.length;
        int expLen = expect.length;
        assert (opLen == parLen) : caseNo + ":wrong";
        assert (opLen == expLen) : caseNo + ":wrong";

        MinStack minStack = new MinStack();

        for (int i = 1; i < opLen; i++) {
            switch (operations[i]) {
                case "push": {
                    int x = parameters[i][0];
                    minStack.push(x);

                    break;
                }
                case "getMin": {
                    int min = minStack.getMin();
                    Integer x = expect[i];

                    assert (min == x) : caseNo + ":wrong:" + i;
                    break;
                }
                case "pop": {
                    minStack.pop();

                    break;
                }
                case "top": {
                    int min = minStack.top();
                    Integer x = expect[i];

                    assert (min == x) : caseNo + ":wrong:" + i;
                    break;
                }

            }
        }

    }
}
