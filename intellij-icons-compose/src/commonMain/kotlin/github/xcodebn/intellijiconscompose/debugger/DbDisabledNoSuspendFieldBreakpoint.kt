package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbDisabledNoSuspendFieldBreakpoint: ImageVector
    get() {
        if (_DbDisabledNoSuspendFieldBreakpoint != null) return _DbDisabledNoSuspendFieldBreakpoint!!

        _DbDisabledNoSuspendFieldBreakpoint = ImageVector.Builder(
            name = "DbDisabledNoSuspendFieldBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 10f)
                curveTo(8.65f, 10.00f, 10.93f, 8.36f, 12.00f, 6.00f)
                curveTo(10.93f, 3.64f, 8.65f, 2.00f, 6.00f, 2.00f)
                curveTo(3.35f, 2.00f, 1.07f, 3.64f, 0.00f, 6.00f)
                curveTo(1.07f, 8.36f, 3.35f, 10.00f, 6.00f, 10.00f)
                close()
                moveTo(9f, 6f)
                curveTo(9.00f, 7.66f, 7.66f, 9.00f, 6.00f, 9.00f)
                curveTo(4.34f, 9.00f, 3.00f, 7.66f, 3.00f, 6.00f)
                curveTo(3.00f, 4.34f, 4.34f, 3.00f, 6.00f, 3.00f)
                curveTo(7.66f, 3.00f, 9.00f, 4.34f, 9.00f, 6.00f)
                close()
            }
        }.build()

        return _DbDisabledNoSuspendFieldBreakpoint!!
    }

private var _DbDisabledNoSuspendFieldBreakpoint: ImageVector? = null

