package github.xcodebn.intellijiconscompose.ide.notification

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InfoeventsDark: ImageVector
    get() {
        if (_InfoeventsDark != null) return _InfoeventsDark!!

        _InfoeventsDark = ImageVector.Builder(
            name = "InfoeventsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 7f)
                lineTo(13f, 7f)
                lineTo(13f, 13f)
                lineTo(7f, 13f)
                curveTo(6.50f, 13.00f, 6.50f, 13.00f, 6.50f, 13.00f)
                curveTo(2.91f, 13.00f, 0.00f, 10.09f, 0.00f, 6.50f)
                curveTo(0.00f, 2.91f, 2.91f, 0.00f, 6.50f, 0.00f)
                curveTo(10.09f, 0.00f, 13.00f, 2.91f, 13.00f, 6.50f)
                curveTo(13.00f, 6.57f, 13.00f, 6.63f, 13.00f, 6.70f)
                close()
            }
        }.build()

        return _InfoeventsDark!!
    }

private var _InfoeventsDark: ImageVector? = null

