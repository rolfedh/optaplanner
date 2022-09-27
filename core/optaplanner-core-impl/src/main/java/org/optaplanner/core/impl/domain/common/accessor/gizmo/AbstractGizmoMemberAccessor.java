package org.optaplanner.core.impl.domain.common.accessor.gizmo;

import org.optaplanner.core.impl.domain.common.accessor.AbstractMemberAccessor;

/**
 * This and its subclasses exist so that Gizmo only needs to generate code where it is necessary for it to be generated.
 * This helps to keep Gizmo code-generation to a minimum,
 * maintaining as much as possible the benefits of static typing and IDE-assisted refactoring.
 */
public abstract class AbstractGizmoMemberAccessor extends AbstractMemberAccessor {

    @Override
    public final String getSpeedNote() {
        return "Fast access with generated bytecode";
    }

}