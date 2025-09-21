package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Plistfile: ImageVector
    get() {
        if (_Plistfile != null) return _Plistfile!!

        _Plistfile = ImageVector.Builder(
            name = "Plistfile",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                horizontalLineToRelative(4f)
                close()
                moveTo(8f, 5f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(10f)
                verticalLineTo(1f)
                close()
                moveTo(6f, 13f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 10f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 12f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                close()
                moveTo(12f, 9f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                close()
                moveTo(12f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineToRelative(5f)
                close()
            }
        }.build()

        return _Plistfile!!
    }

private var _Plistfile: ImageVector? = null

