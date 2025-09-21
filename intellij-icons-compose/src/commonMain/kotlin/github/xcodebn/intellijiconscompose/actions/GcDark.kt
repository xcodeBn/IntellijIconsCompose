package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GcDark: ImageVector
    get() {
        if (_GcDark != null) return _GcDark!!

        _GcDark = ImageVector.Builder(
            name = "GcDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 1f)
                lineTo(3f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 1f)
                lineTo(10f, 1f)
                lineTo(10f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 1f)
                lineTo(3f, 1f)
                close()
                moveTo(1f, 12f)
                lineTo(1f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 12f)
                curveTo(9.00f, 12.42f, 8.40f, 13.00f, 7.67f, 13.00f)
                lineTo(2f, 13f)
                curveTo(1.60f, 13.00f, 1.00f, 12.42f, 1.00f, 11.71f)
                close()
            }
        }.build()

        return _GcDark!!
    }

private var _GcDark: ImageVector? = null

