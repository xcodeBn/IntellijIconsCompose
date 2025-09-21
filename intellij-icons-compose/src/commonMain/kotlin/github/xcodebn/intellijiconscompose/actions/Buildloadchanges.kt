package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Buildloadchanges: ImageVector
    get() {
        if (_Buildloadchanges != null) return _Buildloadchanges!!

        _Buildloadchanges = ImageVector.Builder(
            name = "Buildloadchanges",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 8f)
                lineTo(14f, 13f)
                lineTo(13f, 12f)
                curveTo(11.47f, 13.18f, 9.83f, 14.00f, 8.00f, 14.00f)
                curveTo(5.04f, 14.00f, 2.58f, 11.86f, 2.09f, 9.04f)
                lineTo(4f, 9f)
                curveTo(4.43f, 10.89f, 6.06f, 12.20f, 8.00f, 12.20f)
                curveTo(9.30f, 12.20f, 10.46f, 11.61f, 11.24f, 10.68f)
                lineTo(9f, 9f)
                lineTo(14f, 8f)
                close()
                moveTo(8f, 2f)
                curveTo(10.92f, 2.00f, 13.35f, 4.09f, 13.89f, 6.85f)
                lineTo(12f, 7f)
                curveTo(11.50f, 5.06f, 9.90f, 3.80f, 8.00f, 3.80f)
                curveTo(6.70f, 3.80f, 5.54f, 4.39f, 4.77f, 5.32f)
                lineTo(7f, 7f)
                lineTo(2f, 8f)
                lineTo(2f, 3f)
                lineTo(3f, 4f)
                curveTo(4.53f, 2.82f, 6.17f, 2.00f, 8.00f, 2.00f)
                close()
            }
        }.build()

        return _Buildloadchanges!!
    }

private var _Buildloadchanges: ImageVector? = null

