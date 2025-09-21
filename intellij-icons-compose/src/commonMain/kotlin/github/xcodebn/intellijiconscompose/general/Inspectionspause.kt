package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionspause: ImageVector
    get() {
        if (_Inspectionspause != null) return _Inspectionspause!!

        _Inspectionspause = ImageVector.Builder(
            name = "Inspectionspause",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Inspectionspause!!
    }

private var _Inspectionspause: ImageVector? = null

