package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.Integer32ListDomain;
import tech.intellispaces.ixora.data.collection.UnmovableInteger32ListHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

@ArtifactExtension(origin = Integer32ListDomain.class, target = ArtifactTypes.ObjectProvider)
public interface IntegerListProviderCustomizer {

  UnmovableInteger32ListHandle create(int value1, int value2);

  UnmovableInteger32ListHandle create(int value1, int value2, int value3);

  UnmovableInteger32ListHandle handleOf(int[] array);

  UnmovableInteger32ListHandle handleOf(java.util.List<Integer> list);
}
