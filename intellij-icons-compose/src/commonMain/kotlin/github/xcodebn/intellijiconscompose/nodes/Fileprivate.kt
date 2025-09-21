package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fileprivate: ImageVector
    get() {
        if (_Fileprivate != null) return _Fileprivate!!

        _Fileprivate = ImageVector.Builder(
            name = "Fileprivate",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                close()
                moveTo(8f, 7f)
                verticalLineTo(4f)
                lineTo(5f, 7f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Fileprivate!!
    }

private var _Fileprivate: ImageVector? = null

