package github.xcodebn.intellijiconscompose.plugins

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pluginlogodisabled: ImageVector
    get() {
        if (_Pluginlogodisabled != null) return _Pluginlogodisabled!!

        _Pluginlogodisabled = ImageVector.Builder(
            name = "Pluginlogodisabled",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 15f)
                curveTo(7.50f, 15.78f, 7.95f, 16.52f, 8.67f, 16.89f)
                lineTo(9f, 17f)
                curveTo(10.05f, 17.59f, 10.70f, 17.55f, 11.25f, 17.30f)
                verticalLineTo(14f)
                verticalLineTo(11f)
                verticalLineTo(8f)
                curveTo(10.70f, 7.45f, 10.05f, 7.42f, 9.45f, 7.72f)
                lineTo(9f, 8f)
                curveTo(7.95f, 8.48f, 7.50f, 9.22f, 7.50f, 10.03f)
                verticalLineTo(11f)
                verticalLineTo(14f)
                verticalLineTo(15f)
                close()
                moveTo(15f, 35f)
                curveTo(10.28f, 35.00f, 4.95f, 29.56f, 5.00f, 25.00f)
                verticalLineTo(20f)
                curveTo(5.00f, 16.45f, 6.42f, 15.00f, 7.50f, 15.00f)
                verticalLineTo(10f)
                curveTo(4.75f, 10.00f, 2.50f, 15.20f, 2.50f, 20.00f)
                verticalLineTo(25f)
                curveTo(2.50f, 31.83f, 9.00f, 37.50f, 15.00f, 37.50f)
                horizontalLineTo(28f)
                verticalLineTo(35f)
                horizontalLineTo(15f)
                close()
                moveTo(18f, 3f)
                horizontalLineTo(28f)
                verticalLineTo(21f)
                verticalLineTo(23f)
                horizontalLineTo(24f)
                horizontalLineTo(18f)
                curveTo(14.89f, 22.50f, 12.50f, 19.81f, 12.50f, 16.49f)
                verticalLineTo(9f)
                curveTo(12.50f, 5.19f, 14.89f, 2.50f, 17.84f, 2.50f)
                close()
                moveTo(29f, 20f)
                horizontalLineTo(38f)
                verticalLineTo(18f)
                horizontalLineTo(29f)
                verticalLineTo(20f)
                close()
                moveTo(29f, 8f)
                horizontalLineTo(38f)
                verticalLineTo(5f)
                horizontalLineTo(29f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _Pluginlogodisabled!!
    }

private var _Pluginlogodisabled: ImageVector? = null

