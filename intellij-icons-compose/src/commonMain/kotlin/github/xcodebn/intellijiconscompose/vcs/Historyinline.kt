package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Historyinline: ImageVector
    get() {
        if (_Historyinline != null) return _Historyinline!!

        _Historyinline = ImageVector.Builder(
            name = "Historyinline",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3f)
                curveTo(0.32f, 5.78f, 0.32f, 10.22f, 3.05f, 12.95f)
                curveTo(5.78f, 15.68f, 10.22f, 15.68f, 12.95f, 12.95f)
                curveTo(15.68f, 10.22f, 15.68f, 5.78f, 12.95f, 3.05f)
                curveTo(10.22f, 0.32f, 5.78f, 0.32f, 3.05f, 3.05f)
                close()
                moveTo(3f, 8f)
                curveTo(2.80f, 10.87f, 5.13f, 13.20f, 8.00f, 13.20f)
                curveTo(10.87f, 13.20f, 13.20f, 10.87f, 13.20f, 8.00f)
                curveTo(13.20f, 5.13f, 10.87f, 2.80f, 8.00f, 2.80f)
                curveTo(5.13f, 2.80f, 2.80f, 5.13f, 2.80f, 8.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                lineTo(7f, 9f)
                lineTo(10f, 11f)
                lineTo(11f, 10f)
                lineTo(9f, 8f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Historyinline!!
    }

private var _Historyinline: ImageVector? = null

