package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbVerifiedNoSuspendMethodBreakpoint: ImageVector
    get() {
        if (_DbVerifiedNoSuspendMethodBreakpoint != null) return _DbVerifiedNoSuspendMethodBreakpoint!!

        _DbVerifiedNoSuspendMethodBreakpoint = ImageVector.Builder(
            name = "DbVerifiedNoSuspendMethodBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200))
            ) {
                moveTo(8f, 2f)
                lineTo(7f, 2f)
                lineTo(7f, 1f)
                curveTo(6.49f, 0.95f, 6.25f, 0.85f, 6.00f, 0.85f)
                lineTo(5f, 1f)
                lineTo(6f, 0f)
                lineTo(8f, 2f)
                close()
                moveTo(10f, 4f)
                lineTo(12f, 6f)
                lineTo(6f, 12f)
                lineTo(0f, 6f)
                lineTo(4f, 2f)
                lineTo(4f, 3f)
                curveTo(4.00f, 3.04f, 4.12f, 3.31f, 4.33f, 3.50f)
                lineTo(7f, 6f)
                curveTo(7.19f, 6.09f, 7.77f, 6.09f, 8.15f, 5.74f)
                lineTo(10f, 4f)
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
                    moveTo(8f, 2f)
                    lineTo(7f, 2f)
                    lineTo(7f, 1f)
                    curveTo(6.49f, 0.95f, 6.25f, 0.85f, 6.00f, 0.85f)
                    lineTo(5f, 1f)
                    lineTo(6f, 0f)
                    lineTo(8f, 2f)
                    close()
                    moveTo(10f, 4f)
                    lineTo(12f, 6f)
                    lineTo(6f, 12f)
                    lineTo(0f, 6f)
                    lineTo(4f, 2f)
                    lineTo(4f, 3f)
                    curveTo(4.00f, 3.04f, 4.12f, 3.31f, 4.33f, 3.50f)
                    lineTo(7f, 6f)
                    curveTo(7.19f, 6.09f, 7.77f, 6.09f, 8.15f, 5.74f)
                    lineTo(10f, 4f)
                    close()
                }
            }
        }.build()

        return _DbVerifiedNoSuspendMethodBreakpoint!!
    }

private var _DbVerifiedNoSuspendMethodBreakpoint: ImageVector? = null

