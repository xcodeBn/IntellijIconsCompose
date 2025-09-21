package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Find: ImageVector
    get() {
        if (_Find != null) return _Find!!

        _Find = ImageVector.Builder(
            name = "Find",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                curveTo(2.57f, 11.50f, 0.00f, 8.93f, 0.00f, 5.75f)
                curveTo(0.00f, 2.57f, 2.57f, 0.00f, 5.75f, 0.00f)
                curveTo(8.93f, 0.00f, 11.50f, 2.57f, 11.50f, 5.75f)
                curveTo(11.50f, 8.93f, 8.93f, 11.50f, 5.75f, 11.50f)
                close()
                moveTo(6f, 10f)
                curveTo(7.82f, 9.50f, 9.50f, 7.82f, 9.50f, 5.75f)
                curveTo(9.50f, 3.68f, 7.82f, 2.00f, 5.75f, 2.00f)
                curveTo(3.68f, 2.00f, 2.00f, 3.68f, 2.00f, 5.75f)
                curveTo(2.00f, 7.82f, 3.68f, 9.50f, 5.75f, 9.50f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6f, 12f)
                    curveTo(2.57f, 11.50f, 0.00f, 8.93f, 0.00f, 5.75f)
                    curveTo(0.00f, 2.57f, 2.57f, 0.00f, 5.75f, 0.00f)
                    curveTo(8.93f, 0.00f, 11.50f, 2.57f, 11.50f, 5.75f)
                    curveTo(11.50f, 8.93f, 8.93f, 11.50f, 5.75f, 11.50f)
                    close()
                    moveTo(6f, 10f)
                    curveTo(7.82f, 9.50f, 9.50f, 7.82f, 9.50f, 5.75f)
                    curveTo(9.50f, 3.68f, 7.82f, 2.00f, 5.75f, 2.00f)
                    curveTo(3.68f, 2.00f, 2.00f, 3.68f, 2.00f, 5.75f)
                    curveTo(2.00f, 7.82f, 3.68f, 9.50f, 5.75f, 9.50f)
                    close()
                }
            }
        }.build()

        return _Find!!
    }

private var _Find: ImageVector? = null

