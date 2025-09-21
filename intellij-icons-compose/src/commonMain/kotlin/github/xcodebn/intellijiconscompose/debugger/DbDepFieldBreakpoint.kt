package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbDepFieldBreakpoint: ImageVector
    get() {
        if (_DbDepFieldBreakpoint != null) return _DbDepFieldBreakpoint!!

        _DbDepFieldBreakpoint = ImageVector.Builder(
            name = "DbDepFieldBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(0f, 6f)
                curveTo(0.79f, 6.21f, 1.61f, 6.50f, 2.50f, 6.50f)
                curveTo(2.68f, 6.50f, 2.86f, 6.49f, 3.04f, 6.46f)
                curveTo(3.26f, 7.90f, 4.50f, 9.00f, 6.00f, 9.00f)
                curveTo(7.66f, 9.00f, 9.00f, 7.66f, 9.00f, 6.00f)
                curveTo(9.00f, 4.50f, 7.90f, 3.26f, 6.46f, 3.04f)
                curveTo(6.49f, 2.86f, 6.50f, 2.68f, 6.50f, 2.50f)
                curveTo(6.50f, 2.34f, 6.49f, 2.18f, 6.47f, 2.02f)
                curveTo(8.92f, 2.20f, 11.00f, 3.78f, 12.00f, 6.00f)
                curveTo(10.93f, 8.36f, 8.65f, 10.00f, 6.00f, 10.00f)
                curveTo(3.35f, 10.00f, 1.07f, 8.36f, -0.00f, 6.00f)
                curveTo(0.04f, 5.91f, 0.09f, 5.81f, 0.13f, 5.72f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFDB5860))
                ) {
                    moveTo(0f, 6f)
                    curveTo(0.79f, 6.21f, 1.61f, 6.50f, 2.50f, 6.50f)
                    curveTo(2.68f, 6.50f, 2.86f, 6.49f, 3.04f, 6.46f)
                    curveTo(3.26f, 7.90f, 4.50f, 9.00f, 6.00f, 9.00f)
                    curveTo(7.66f, 9.00f, 9.00f, 7.66f, 9.00f, 6.00f)
                    curveTo(9.00f, 4.50f, 7.90f, 3.26f, 6.46f, 3.04f)
                    curveTo(6.49f, 2.86f, 6.50f, 2.68f, 6.50f, 2.50f)
                    curveTo(6.50f, 2.34f, 6.49f, 2.18f, 6.47f, 2.02f)
                    curveTo(8.92f, 2.20f, 11.00f, 3.78f, 12.00f, 6.00f)
                    curveTo(10.93f, 8.36f, 8.65f, 10.00f, 6.00f, 10.00f)
                    curveTo(3.35f, 10.00f, 1.07f, 8.36f, -0.00f, 6.00f)
                    curveTo(0.04f, 5.91f, 0.09f, 5.81f, 0.13f, 5.72f)
                    close()
                }
            }
        }.build()

        return _DbDepFieldBreakpoint!!
    }

private var _DbDepFieldBreakpoint: ImageVector? = null

