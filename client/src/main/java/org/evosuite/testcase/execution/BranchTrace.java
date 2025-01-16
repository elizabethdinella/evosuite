package org.evosuite.testcase.execution;

/**
 * <p>BranchTrace class.</p>
 * @author Elizabeth Dinella
 */
public class BranchTrace {
    public Integer branchId;
    public String originMethod;
    public Double trueDistance;
    public Double falseDistance;

    public BranchTrace(Integer branchId, String originMethod, Double trueDist, Double falseDist) {
        this.branchId = branchId;
        this.originMethod = originMethod;
        this.trueDistance = trueDist;
        this.falseDistance = falseDist; 
    }


}
