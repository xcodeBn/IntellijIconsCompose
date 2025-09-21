package github.xcodebn.intellijiconscompose.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UnknownDark: ImageVector
    get() {
        if (_UnknownDark != null) return _UnknownDark!!

        _UnknownDark = ImageVector.Builder(
            name = "UnknownDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                curveTo(4.14f, 1.00f, 1.00f, 4.14f, 1.00f, 8.00f)
                curveTo(1.00f, 11.86f, 4.14f, 15.00f, 8.00f, 15.00f)
                curveTo(11.86f, 15.00f, 15.00f, 11.86f, 15.00f, 8.00f)
                curveTo(15.00f, 4.14f, 11.86f, 1.00f, 8.00f, 1.00f)
                close()
                moveTo(10f, 12f)
                curveTo(9.37f, 11.70f, 8.70f, 11.03f, 8.70f, 10.20f)
                curveTo(8.70f, 9.37f, 9.37f, 8.70f, 10.20f, 8.70f)
                curveTo(11.03f, 8.70f, 11.70f, 9.37f, 11.70f, 10.20f)
                curveTo(11.70f, 11.03f, 11.03f, 11.70f, 10.20f, 11.70f)
                close()
                moveTo(6f, 12f)
                curveTo(4.97f, 11.70f, 4.30f, 11.03f, 4.30f, 10.20f)
                curveTo(4.30f, 9.37f, 4.97f, 8.70f, 5.80f, 8.70f)
                curveTo(6.63f, 8.70f, 7.30f, 9.37f, 7.30f, 10.20f)
                curveTo(7.30f, 11.03f, 6.63f, 11.70f, 5.80f, 11.70f)
                close()
                moveTo(9f, 6f)
                curveTo(8.70f, 4.97f, 9.37f, 4.30f, 10.20f, 4.30f)
                curveTo(11.03f, 4.30f, 11.70f, 4.97f, 11.70f, 5.80f)
                curveTo(11.70f, 6.63f, 11.03f, 7.30f, 10.20f, 7.30f)
                curveTo(9.37f, 7.30f, 8.70f, 6.63f, 8.70f, 5.80f)
                close()
                moveTo(4f, 6f)
                curveTo(4.30f, 4.97f, 4.97f, 4.30f, 5.80f, 4.30f)
                curveTo(6.63f, 4.30f, 7.30f, 4.97f, 7.30f, 5.80f)
                curveTo(7.30f, 6.63f, 6.63f, 7.30f, 5.80f, 7.30f)
                curveTo(4.97f, 7.30f, 4.30f, 6.63f, 4.30f, 5.80f)
                close()
            }
        }.build()

        return _UnknownDark!!
    }

private var _UnknownDark: ImageVector? = null

