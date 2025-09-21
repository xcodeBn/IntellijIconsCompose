package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Show: ImageVector
    get() {
        if (_Show != null) return _Show!!

        _Show = ImageVector.Builder(
            name = "Show",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 3f)
                curveTo(4.82f, 3.00f, 2.10f, 5.07f, 1.00f, 8.00f)
                curveTo(2.10f, 10.93f, 4.82f, 13.00f, 8.00f, 13.00f)
                curveTo(11.18f, 13.00f, 13.90f, 10.93f, 15.00f, 8.00f)
                curveTo(13.90f, 5.07f, 11.18f, 3.00f, 8.00f, 3.00f)
                close()
                moveTo(8f, 12f)
                curveTo(6.07f, 11.50f, 4.50f, 9.93f, 4.50f, 8.00f)
                curveTo(4.50f, 6.07f, 6.07f, 4.50f, 8.00f, 4.50f)
                curveTo(9.93f, 4.50f, 11.50f, 6.07f, 11.50f, 8.00f)
                curveTo(11.50f, 9.93f, 9.93f, 11.50f, 8.00f, 11.50f)
                close()
                moveTo(8f, 6f)
                curveTo(6.89f, 6.00f, 6.00f, 6.89f, 6.00f, 8.00f)
                curveTo(6.00f, 9.11f, 6.89f, 10.00f, 8.00f, 10.00f)
                curveTo(9.11f, 10.00f, 10.00f, 9.11f, 10.00f, 8.00f)
                curveTo(10.00f, 6.89f, 9.11f, 6.00f, 8.00f, 6.00f)
                close()
            }
        }.build()

        return _Show!!
    }

private var _Show: ImageVector? = null

