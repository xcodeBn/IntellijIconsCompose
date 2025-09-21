package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FetchDark: ImageVector
    get() {
        if (_FetchDark != null) return _FetchDark!!

        _FetchDark = ImageVector.Builder(
            name = "FetchDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 4f)
                lineTo(12f, 2f)
                lineTo(5f, 8f)
                lineTo(3f, 6f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                lineTo(8f, 11f)
                lineTo(14f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(12f, 2f)
                lineTo(13f, 1f)
                lineTo(12f, 1f)
                lineTo(11f, 1f)
                lineTo(12f, 2f)
                close()
                moveTo(14f, 4f)
                lineTo(15f, 5f)
                lineTo(15f, 4f)
                lineTo(15f, 3f)
                lineTo(14f, 4f)
                close()
                moveTo(5f, 8f)
                lineTo(5f, 9f)
                lineTo(5f, 10f)
                lineTo(6f, 9f)
                lineTo(5f, 8f)
                close()
                moveTo(3f, 6f)
                lineTo(4f, 5f)
                lineTo(2f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
                moveTo(10f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                lineTo(11f, 12f)
                lineTo(10f, 13f)
                close()
                moveTo(8f, 11f)
                lineTo(7f, 10f)
                lineTo(6f, 11f)
                lineTo(7f, 11f)
                lineTo(8f, 11f)
                close()
                moveTo(11f, 3f)
                lineTo(13f, 5f)
                lineTo(15f, 3f)
                lineTo(13f, 1f)
                lineTo(11f, 3f)
                close()
                moveTo(6f, 9f)
                lineTo(13f, 3f)
                lineTo(11f, 1f)
                lineTo(5f, 8f)
                lineTo(6f, 9f)
                close()
                moveTo(2f, 7f)
                lineTo(5f, 9f)
                lineTo(6f, 8f)
                lineTo(4f, 5f)
                lineTo(2f, 7f)
                close()
                moveTo(4f, 13f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                close()
                moveTo(10f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
                moveTo(7f, 11f)
                lineTo(9f, 14f)
                lineTo(11f, 12f)
                lineTo(8f, 10f)
                lineTo(7f, 11f)
                close()
                moveTo(13f, 3f)
                lineTo(7f, 10f)
                lineTo(8f, 11f)
                lineTo(15f, 5f)
                lineTo(13f, 3f)
                close()
            }
        }.build()

        return _FetchDark!!
    }

private var _FetchDark: ImageVector? = null

