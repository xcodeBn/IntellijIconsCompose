package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionsokempty: ImageVector
    get() {
        if (_Inspectionsokempty != null) return _Inspectionsokempty!!

        _Inspectionsokempty = ImageVector.Builder(
            name = "Inspectionsokempty",
            defaultWidth = 16.0.dp,
            defaultHeight = 17.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 17.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
                stroke = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(7f, 13f)
                lineTo(14f, 6f)
                lineTo(12f, 4f)
                lineTo(7f, 9f)
                lineTo(4f, 7f)
                lineTo(2f, 9f)
                lineTo(7f, 13f)
                close()
            }
        }.build()

        return _Inspectionsokempty!!
    }

private var _Inspectionsokempty: ImageVector? = null

