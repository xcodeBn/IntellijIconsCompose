package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrackcoverageDark: ImageVector
    get() {
        if (_TrackcoverageDark != null) return _TrackcoverageDark!!

        _TrackcoverageDark = ImageVector.Builder(
            name = "TrackcoverageDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 4f)
                lineTo(8f, 12f)
                curveTo(10.21f, 11.33f, 11.38f, 10.01f, 11.50f, 8.52f)
                lineTo(12f, 4f)
                lineTo(8f, 4f)
                close()
                moveTo(2f, 3f)
                lineTo(8f, 2f)
                lineTo(14f, 3f)
                lineTo(14f, 9f)
                curveTo(13.31f, 10.90f, 11.48f, 12.82f, 8.00f, 14.50f)
                curveTo(4.53f, 12.82f, 2.69f, 10.91f, 2.50f, 8.76f)
                lineTo(2f, 3f)
                close()
            }
        }.build()

        return _TrackcoverageDark!!
    }

private var _TrackcoverageDark: ImageVector? = null

