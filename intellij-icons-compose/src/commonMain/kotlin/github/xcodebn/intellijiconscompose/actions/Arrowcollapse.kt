package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrowcollapse: ImageVector
    get() {
        if (_Arrowcollapse != null) return _Arrowcollapse!!

        _Arrowcollapse = ImageVector.Builder(
            name = "Arrowcollapse",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF6E6E6E)),
                strokeLineWidth = 2.0f
            ) {
                moveTo(10f, 3f)
                lineTo(5f, 8f)
                lineTo(10f, 13f)
            }
        }.build()

        return _Arrowcollapse!!
    }

private var _Arrowcollapse: ImageVector? = null

