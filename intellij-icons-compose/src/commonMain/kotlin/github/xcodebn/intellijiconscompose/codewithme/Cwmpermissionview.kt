package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmpermissionview: ImageVector
    get() {
        if (_Cwmpermissionview != null) return _Cwmpermissionview!!

        _Cwmpermissionview = ImageVector.Builder(
            name = "Cwmpermissionview",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(8f, 4f)
            }
        }.build()

        return _Cwmpermissionview!!
    }

private var _Cwmpermissionview: ImageVector? = null

