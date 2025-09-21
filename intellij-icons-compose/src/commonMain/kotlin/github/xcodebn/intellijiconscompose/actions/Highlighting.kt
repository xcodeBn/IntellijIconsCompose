package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Highlighting: ImageVector
    get() {
        if (_Highlighting != null) return _Highlighting!!

        _Highlighting = ImageVector.Builder(
            name = "Highlighting",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 2f)
                lineTo(15f, 2f)
                lineTo(15f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 2f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 12f)
                lineTo(8f, 12f)
                lineTo(6f, 4f)
                lineTo(5f, 4f)
                lineTo(2f, 12f)
                lineTo(3f, 12f)
                lineTo(4f, 10f)
                lineTo(7f, 10f)
                close()
                moveTo(4f, 9f)
                lineTo(5f, 6f)
                lineTo(6f, 9f)
                lineTo(4f, 9f)
                close()
                moveTo(14f, 9f)
                lineTo(14f, 9f)
                curveTo(13.64f, 7.98f, 13.45f, 7.32f, 13.09f, 6.84f)
                curveTo(12.72f, 6.36f, 12.21f, 6.12f, 11.57f, 6.12f)
                curveTo(10.99f, 6.12f, 10.53f, 6.32f, 10.19f, 6.72f)
                lineTo(10f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 12f)
                lineTo(10f, 12f)
                lineTo(10f, 11f)
                curveTo(10.48f, 11.37f, 10.96f, 11.60f, 11.58f, 11.60f)
                curveTo(12.22f, 11.60f, 12.72f, 11.36f, 13.09f, 10.87f)
                curveTo(13.46f, 10.39f, 13.64f, 9.73f, 13.64f, 8.91f)
                close()
                moveTo(12f, 9f)
                lineTo(12f, 9f)
                curveTo(12.45f, 9.52f, 12.34f, 9.94f, 12.14f, 10.22f)
                curveTo(11.94f, 10.49f, 11.65f, 10.63f, 11.28f, 10.63f)
                curveTo(10.77f, 10.63f, 10.40f, 10.40f, 10.19f, 9.94f)
                lineTo(10f, 8f)
                curveTo(10.40f, 7.31f, 10.76f, 7.09f, 11.27f, 7.09f)
                curveTo(11.66f, 7.09f, 11.95f, 7.23f, 12.15f, 7.52f)
                curveTo(12.35f, 7.81f, 12.46f, 8.24f, 12.46f, 8.81f)
                close()
            }
        }.build()

        return _Highlighting!!
    }

private var _Highlighting: ImageVector? = null

