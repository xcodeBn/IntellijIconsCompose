package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbDisabledBreakpoint: ImageVector
    get() {
        if (_DbDisabledBreakpoint != null) return _DbDisabledBreakpoint!!

        _DbDisabledBreakpoint = ImageVector.Builder(
            name = "DbDisabledBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                curveTo(2.96f, 11.50f, 0.50f, 9.04f, 0.50f, 6.00f)
                curveTo(0.50f, 2.96f, 2.96f, 0.50f, 6.00f, 0.50f)
                curveTo(9.04f, 0.50f, 11.50f, 2.96f, 11.50f, 6.00f)
                curveTo(11.50f, 9.04f, 9.04f, 11.50f, 6.00f, 11.50f)
                close()
                moveTo(6f, 10f)
                curveTo(8.21f, 10.00f, 10.00f, 8.21f, 10.00f, 6.00f)
                curveTo(10.00f, 3.79f, 8.21f, 2.00f, 6.00f, 2.00f)
                curveTo(3.79f, 2.00f, 2.00f, 3.79f, 2.00f, 6.00f)
                curveTo(2.00f, 8.21f, 3.79f, 10.00f, 6.00f, 10.00f)
                close()
            }
        }.build()

        return _DbDisabledBreakpoint!!
    }

private var _DbDisabledBreakpoint: ImageVector? = null

