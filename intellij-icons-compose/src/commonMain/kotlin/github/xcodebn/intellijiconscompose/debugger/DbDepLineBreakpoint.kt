package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbDepLineBreakpoint: ImageVector
    get() {
        if (_DbDepLineBreakpoint != null) return _DbDepLineBreakpoint!!

        _DbDepLineBreakpoint = ImageVector.Builder(
            name = "DbDepLineBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(1f, 6f)
                curveTo(0.96f, 6.23f, 1.48f, 6.41f, 2.03f, 6.47f)
                curveTo(2.26f, 8.46f, 3.95f, 10.00f, 6.00f, 10.00f)
                curveTo(8.21f, 10.00f, 10.00f, 8.21f, 10.00f, 6.00f)
                curveTo(10.00f, 3.95f, 8.46f, 2.26f, 6.47f, 2.03f)
                curveTo(6.41f, 1.48f, 6.23f, 0.96f, 5.96f, 0.50f)
                curveTo(5.98f, 0.50f, 5.99f, 0.50f, 6.00f, 0.50f)
                curveTo(9.04f, 0.50f, 11.50f, 2.96f, 11.50f, 6.00f)
                curveTo(11.50f, 9.04f, 9.04f, 11.50f, 6.00f, 11.50f)
                curveTo(2.96f, 11.50f, 0.50f, 9.04f, 0.50f, 6.00f)
                curveTo(0.50f, 5.99f, 0.50f, 5.98f, 0.50f, 5.96f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFDB5860))
                ) {
                    moveTo(1f, 6f)
                    curveTo(0.96f, 6.23f, 1.48f, 6.41f, 2.03f, 6.47f)
                    curveTo(2.26f, 8.46f, 3.95f, 10.00f, 6.00f, 10.00f)
                    curveTo(8.21f, 10.00f, 10.00f, 8.21f, 10.00f, 6.00f)
                    curveTo(10.00f, 3.95f, 8.46f, 2.26f, 6.47f, 2.03f)
                    curveTo(6.41f, 1.48f, 6.23f, 0.96f, 5.96f, 0.50f)
                    curveTo(5.98f, 0.50f, 5.99f, 0.50f, 6.00f, 0.50f)
                    curveTo(9.04f, 0.50f, 11.50f, 2.96f, 11.50f, 6.00f)
                    curveTo(11.50f, 9.04f, 9.04f, 11.50f, 6.00f, 11.50f)
                    curveTo(2.96f, 11.50f, 0.50f, 9.04f, 0.50f, 6.00f)
                    curveTo(0.50f, 5.99f, 0.50f, 5.98f, 0.50f, 5.96f)
                    close()
                }
            }
        }.build()

        return _DbDepLineBreakpoint!!
    }

private var _DbDepLineBreakpoint: ImageVector? = null

