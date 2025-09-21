package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbVerifiedNoSuspendBreakpoint: ImageVector
    get() {
        if (_DbVerifiedNoSuspendBreakpoint != null) return _DbVerifiedNoSuspendBreakpoint!!

        _DbVerifiedNoSuspendBreakpoint = ImageVector.Builder(
            name = "DbVerifiedNoSuspendBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200))
            ) {
                moveTo(8f, 1f)
                lineTo(7f, 2f)
                lineTo(7f, 1f)
                curveTo(6.49f, 0.95f, 6.25f, 0.85f, 6.00f, 0.85f)
                lineTo(5f, 1f)
                curveTo(4.45f, 0.85f, 4.00f, 1.30f, 4.00f, 1.85f)
                lineTo(4f, 3f)
                curveTo(4.00f, 3.04f, 4.12f, 3.31f, 4.33f, 3.50f)
                lineTo(7f, 6f)
                curveTo(7.19f, 6.09f, 7.77f, 6.09f, 8.15f, 5.74f)
                lineTo(11f, 3f)
                curveTo(11.25f, 4.12f, 11.50f, 5.03f, 11.50f, 6.00f)
                curveTo(11.50f, 9.04f, 9.04f, 11.50f, 6.00f, 11.50f)
                curveTo(2.96f, 11.50f, 0.50f, 9.04f, 0.50f, 6.00f)
                curveTo(0.50f, 2.96f, 2.96f, 0.50f, 6.00f, 0.50f)
                curveTo(6.85f, 0.50f, 7.65f, 0.69f, 8.37f, 1.04f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(12f, 1f)
                lineTo(7f, 5f)
                lineTo(5f, 3f)
                lineTo(5f, 2f)
                lineTo(6f, 2f)
                lineTo(7f, 3f)
                lineTo(11f, 0f)
                lineTo(12f, 0f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFEDA200))
                ) {
                    moveTo(8f, 1f)
                    lineTo(7f, 2f)
                    lineTo(7f, 1f)
                    curveTo(6.49f, 0.95f, 6.25f, 0.85f, 6.00f, 0.85f)
                    lineTo(5f, 1f)
                    curveTo(4.45f, 0.85f, 4.00f, 1.30f, 4.00f, 1.85f)
                    lineTo(4f, 3f)
                    curveTo(4.00f, 3.04f, 4.12f, 3.31f, 4.33f, 3.50f)
                    lineTo(7f, 6f)
                    curveTo(7.19f, 6.09f, 7.77f, 6.09f, 8.15f, 5.74f)
                    lineTo(11f, 3f)
                    curveTo(11.25f, 4.12f, 11.50f, 5.03f, 11.50f, 6.00f)
                    curveTo(11.50f, 9.04f, 9.04f, 11.50f, 6.00f, 11.50f)
                    curveTo(2.96f, 11.50f, 0.50f, 9.04f, 0.50f, 6.00f)
                    curveTo(0.50f, 2.96f, 2.96f, 0.50f, 6.00f, 0.50f)
                    curveTo(6.85f, 0.50f, 7.65f, 0.69f, 8.37f, 1.04f)
                    close()
                }
            }
        }.build()

        return _DbVerifiedNoSuspendBreakpoint!!
    }

private var _DbVerifiedNoSuspendBreakpoint: ImageVector? = null

