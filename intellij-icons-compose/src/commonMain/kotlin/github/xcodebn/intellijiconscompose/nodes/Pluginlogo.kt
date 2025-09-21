package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pluginlogo: ImageVector
    get() {
        if (_Pluginlogo != null) return _Pluginlogo!!

        _Pluginlogo = ImageVector.Builder(
            name = "Pluginlogo",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 12f)
                curveTo(6.00f, 12.62f, 6.36f, 13.22f, 6.93f, 13.51f)
                lineTo(8f, 14f)
                curveTo(8.04f, 14.07f, 8.56f, 14.04f, 9.00f, 13.84f)
                lineTo(9f, 11f)
                lineTo(9f, 9f)
                lineTo(9f, 6f)
                curveTo(8.56f, 5.96f, 8.04f, 5.93f, 7.56f, 6.18f)
                lineTo(7f, 6f)
                curveTo(6.36f, 6.78f, 6.00f, 7.37f, 6.00f, 8.02f)
                lineTo(6f, 9f)
                lineTo(6f, 11f)
                lineTo(6f, 12f)
                close()
                moveTo(12f, 28f)
                curveTo(8.22f, 28.00f, 3.96f, 23.64f, 4.00f, 20.00f)
                lineTo(4f, 16f)
                curveTo(4.00f, 13.16f, 5.13f, 12.00f, 6.00f, 12.00f)
                lineTo(6f, 8f)
                curveTo(3.80f, 8.00f, 2.00f, 12.16f, 2.00f, 16.00f)
                lineTo(2f, 20f)
                curveTo(2.00f, 25.47f, 7.20f, 30.00f, 12.00f, 30.00f)
                lineTo(22f, 30f)
                lineTo(22f, 28f)
                lineTo(12f, 28f)
                close()
                moveTo(14f, 2f)
                lineTo(22f, 2f)
                lineTo(22f, 17f)
                lineTo(22f, 18f)
                lineTo(19f, 18f)
                lineTo(14f, 18f)
                curveTo(11.91f, 18.00f, 10.00f, 15.85f, 10.00f, 13.19f)
                lineTo(10f, 7f)
                curveTo(10.00f, 4.15f, 11.91f, 2.00f, 14.27f, 2.00f)
                close()
                moveTo(23f, 16f)
                lineTo(30f, 16f)
                lineTo(30f, 14f)
                lineTo(23f, 14f)
                lineTo(23f, 16f)
                close()
                moveTo(23f, 6f)
                lineTo(30f, 6f)
                lineTo(30f, 4f)
                lineTo(23f, 4f)
                lineTo(23f, 6f)
                close()
            }
        }.build()

        return _Pluginlogo!!
    }

private var _Pluginlogo: ImageVector? = null

