package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionswarning: ImageVector
    get() {
        if (_Inspectionswarning != null) return _Inspectionswarning!!

        _Inspectionswarning = ImageVector.Builder(
            name = "Inspectionswarning",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2f)
                lineTo(14f, 13f)
                horizontalLineTo(2f)
                lineTo(8f, 2f)
                close()
                moveTo(7f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Inspectionswarning!!
    }

private var _Inspectionswarning: ImageVector? = null

